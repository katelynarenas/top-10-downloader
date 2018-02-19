package com.howtodothatinkotlin.top10downloader

import android.content.Context
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate called")
        val downloadData = DownloadData()
        downloadData.execute("URL goes here")
        Log.d(TAG, "onCreate done")


    }

    companion object {
        private class DownloadData : AsyncTask<String, Void, String>(){
            private val TAG = "Download Data"

            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)
                Log.d(TAG, "onPostExecute: parameter is $result")
            }

            override fun doInBackground(vararg p0: String?): String {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Log.d(TAG, "doInBackround: starts with ${p0[0]}")
                return "doInBackground completed"
            }
        }
    }
}
