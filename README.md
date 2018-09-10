# Android-Data-Debugger


**Android Data Debugger** is a sdk tool which provides debug feature for Android Applications to view all databases and query on them using smart query templates. Supports SQLite database and all versions of CouchbaseLite database.


## Functionality
- Show all sqlite and couchbase databases
- Show all tables of selected database
- Gives a console where you can query on selected table
- Provide *Smart Query Templates* which gives you predefined queries on the fly
- Shows queried data in a page of default size 20 rows(can be change from pagination tool), for large data you can go particular page on the go using bottom [Pagination view](https://pkjvit.github.io/PaginationView/)


## Screen Shots

<div>
<img src="https://github.com/pkjvit/couchbase-lite-android-viewer/blob/master/screenshots/cblite_viewer_01.png" width="200">
<img width="20">
<img src="https://github.com/pkjvit/couchbase-lite-android-viewer/blob/master/screenshots/cblite_viewer_02.png" width="200">
<img width="20">
<img src="https://github.com/pkjvit/couchbase-lite-android-viewer/blob/master/screenshots/cblite_viewer_03.png" width="200">
</div>

## Preview
![CbliteViewer](https://github.com/pkjvit/couchbase-lite-android-viewer/blob/master/screenshots/cblite_viewer_250x.gif)

## Requirements

- Android 4.1+
- Android Studio 3.0

## Installation

Add the following in the dependencies section of the application's build.gradle (the one in the app folder).

```
    implementation 'com.pkj.wow.android.datadebug:AndroidDataDebugger:0.1.0-5'
    
    // dependencies
    implementation 'com.pkj.wow.paginationview:PaginationView:1.0.2-8'
    implementation 'de.codecrafters.tableview:tableview:2.8.0'
    implementation 'com.android.support.constraint:constraint-layout:1.0.2'
```

## Usage

To view your all database's it needs context to redirect on screen which have all data and sync information regarding manger.

```
// Initialise by passing application context
DataDebug dataDebug = DataDebug.instance(getApplicationContext());
              
// Start will show database screen
dataDebug.start();
```


## Licence
    Copyright 2018 Pankaj Jangid

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
