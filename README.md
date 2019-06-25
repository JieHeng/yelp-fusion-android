# yelp-fusion-android
Android client library for [Yelp Fusion API](https://www.yelp.com/developers/documentation/v3/get_started). Written with Kotlin and RxJava 2, allows developers to interact with the API in a reactive manner.

## Preparation
Step 1. Add the dependency
```
dependencies {
    implementation 'io.reactivex.rxjava2:rxjava:2.2.10'
}
```
Step 2. Add INTERNET permission to manifest file
```
<uses-permission android:name="android.permission.INTERNET"/>
```
## Initialization
Initialize the library with the API key which can be obtained from [Manage App](https://www.yelp.com/developers/v3/manage_app)
```
YelpFusionApi.init("YOUR_API_KEY")
```

## Usage
#### [Business Search](https://www.yelp.com/developers/documentation/v3/business_search) - Search for businesses by keyword, category, location, price level, etc.
```
// construct the request
val request = BusinessSearchRequest(
    term = "food",
    latitude = 1.3521,
    longitude = 103.8198
)
// call the API
YelpFusionApi.get()
    .getBusinessSearch(request)
    .subscribeOn(Schedulers.io())
    .subscribe({
        // process the BussinessSearchResponse
    }, {
        // handle exception
    })
```

#### [Phone Search](https://www.yelp.com/developers/documentation/v3/business_search_phone) - Search for businesses by phone number.
```
YelpFusionApi.get()
    .getPhoneSearch("+123456789")
    .subscribeOn(Schedulers.io())
    .subscribe({
        // process the PhoneSearchResponse
    }, {
        // handle exception
    })
```

#### [Transaction Search](https://www.yelp.com/developers/documentation/v3/transaction_search) - Search for businesses which support food delivery transactions.
```
// construct the request
val request = TransactionSearchRequest(
    transactionType = "delivery",
    latitude = 37.786882,
    longitude = -122.399972
)
// call the API
YelpFusionApi.get()
    .getTransactionSearch(request)
    .subscribeOn(Schedulers.io())
    .subscribe({
        // process the TransactionSearchResponse
    }, {
        // handle exception
    })
```

#### [Business Details](https://www.yelp.com/developers/documentation/v3/business) - Get rich business data, such as name, address, phone number, photos, Yelp rating, price levels and hours of operation.
```
YelpFusionApi.get()
    .getBusinessDetails("WavvLdfdP6g8aZTtbBQHTw")
    .subscribeOn(Schedulers.io())
    .subscribe({
        // process the BusinessDetails
    }, {
        // handle exception
    })
```

#### [Reviews](https://www.yelp.com/developers/documentation/v3/business_reviews) - Get up to three review excerpts for a business.
```
YelpFusionApi.get()
    .getBusinessReviews("WavvLdfdP6g8aZTtbBQHTw")
    .subscribeOn(Schedulers.io())
    .subscribe({
        // process the ReviewsResponse
    }, {
        // handle exception
    })
```

#### [Autocomplete](https://www.yelp.com/developers/documentation/v3/autocomplete) - Provide autocomplete suggestions for businesses, search keywords and categories.
```
// construct the request
val request = AutoCompleteRequest(
    text = "del",
    latitude = 1.3521,
    longitude = 103.8198
)
// call the API
YelpFusionApi.get()
    .getAutocomplete(request)
    .subscribeOn(Schedulers.io())
    .subscribe({
        // process the AutoCompleteResponse
    }, {
        // handle exception
    })
```
## MIT License
```
Copyright (c) 2019 Jie Heng

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
