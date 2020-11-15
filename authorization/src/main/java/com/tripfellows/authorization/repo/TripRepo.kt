package com.tripfellows.authorization.repo

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tripfellows.authorization.ApplicationModified
import com.tripfellows.authorization.network.ApiRepo
import com.tripfellows.authorization.network.request.CreateTripRequest
import com.tripfellows.authorization.states.CreateTripProgress
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TripRepo(private val apiRepo: ApiRepo) {

    companion object {
        fun getInstance(context: Context): TripRepo {
            return ApplicationModified.from(context).tripRepo
        }
    }

    fun createTrip(createTripRequest: CreateTripRequest): LiveData<CreateTripProgress> {
        val createTripProgress: MutableLiveData<CreateTripProgress> = MutableLiveData()
        createTripProgress.value = CreateTripProgress.IN_PROGRESS

        apiRepo.tripApi.createTrip(createTripRequest).enqueue(object: Callback<CreateTripRequest> {
            override fun onResponse(call: Call<CreateTripRequest>, response: Response<CreateTripRequest>) {
                if (response.isSuccessful && response.body() != null) {
                    createTripProgress.postValue(CreateTripProgress.SUCCESS)
                }
            }

            override fun onFailure(call: Call<CreateTripRequest>, t: Throwable) {
                createTripProgress.postValue(CreateTripProgress.FAILED)
            }
        })

        return createTripProgress
    }
}