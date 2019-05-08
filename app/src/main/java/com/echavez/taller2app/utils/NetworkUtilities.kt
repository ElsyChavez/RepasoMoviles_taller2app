package com.echavez.taller2app.utils

import android.net.Uri
import java.net.URL

class NetworkUtilities {


    //metodos estaticos
    companion object {

        const val BASE_URL = "http://localhost/"
        const val PATH_COIN = "coin"
        const val TOKEN = "AS"

        /*
        * Get by ID URL Maker*/

        fun buildURL(id: String) = URL(
            Uri.parse(BASE_URL)
                .buildUpon()
                .appendPath(PATH_COIN)
                .appendPath(id)
                .build().toString()
        )


        /*
* Get all Coins URL Maker*/
        fun buildURL() = URL(
            Uri.parse(BASE_URL)
                .buildUpon()
                .build().toString()
        )

        /*fun getHTTPResult(url:URL)= url.openConnection()
            .addRequestProperty("Authorization", "Bear {$TOKEN}")*/

        fun getHTTPResult(url:URL)= url.readText()

    }

}