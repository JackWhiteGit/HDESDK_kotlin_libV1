HelpDeskEddy Kotlin Android SDK
==================

This page gives you the basic steps for getting up and running with the HelpDeskEddy SDK.

## The SDK has the following requirements:

Minimum Android version: API level 24 (Nougat / 7.0)

## What is the HelpDeskEddy SDK?
The HelpDeskEddy SDK helps you add the following features to your app:

Show Knowledge Base content<br/>
Show available departments<br/>
Show/create/update:<br/>
tickets<br/>
users<br/>
ticket comments.

You can also use the HelpDeskEddy SDK without our UI, and build your own UI on top of our API providers. This takes a little more development time but gives you more control. To find out more, see API providers.

## What you need to get started
You need HelpDeskEddy account and apiKey for API access. 

## Getting up and running
Add the SDK to your project by including the following snippets in the build.gradle file:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
```groovy
dependencies {
   implementation 'com.github.JackWhiteGit:HDESDK_kotlin_libV1:0.1.0'
}
```
Create AsyncTask (or other thread's method) and initialize SDK in the AsyncTask method of an Activity where you plan to use the SDK:

```kotlin
       class RequestTask() : AsyncTask<Void, Void, String>() {
        override fun doInBackground(vararg params: Void?): String? {
            val options: Map<String?, String?> = mapOf(
                "title" to "Problem with email",
                "description" to "Problem with email",
                "sla_date" to "20.07.2020 00:00",
                "priority_id" to "1",
                "user_email" to "example@example.com",
                "create_from_user" to "1"
            )

            val hdesdk = SDKinit(
                "example@example.com",
                "apiKey",
                "https://example.helpdeskeddy.com"
            )
            return hdesdk.TicketCreate(options)
        }
      
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
        }
    }
```

And call AsyncTask with your API requests in onCreate method:

```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RequestTask().execute()
    }
```   
For more information You can visit [Javadoc SDK Documentation](http://eddyplugins.com/docs/HDE_KOTLIN_SDK/index.html) and official [HelpDeskEddy API Documentation](https://helpdeskeddy.ru/api.html)
