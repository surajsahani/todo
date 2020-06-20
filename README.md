# To-do UC Application Overview <br><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![rsz_screenshot_from_2020-06-18_16-25-03](https://user-images.githubusercontent.com/22853459/85012370-8bf15280-b180-11ea-98ca-b47fdbf9a85c.png)
- [ ] 1. New Task Button - This button is present on the AppBar, clicking on this button should open a dialog box showing text input for the task and a Submit button- ``Ongoing``. <br><br>
- [X] 2. Clicking the Submit button should save the task in the SQLite database. <br><br>
- [ ] 3. There should be a RecyclerView displaying the list of Tasks and a “Check” button. Clicking the “Check” button will mark the task’s state as complete. The text in the task should strikethrough at this point- ``Ongoing``. <br><br>
- [X] 4. Once the task is marked complete, there should be two buttons in place of the “Check” button. These buttons are “Undo” and “Delete”. Clicking on the Undo button will mark the task’s state as incomplete again (the text in the task will not be strikethrough now). Clicking on the Delete button will remove the task from the list. <br><br>
- [X] 5. All these states/actions should be saved in the SQLite database. <br><br>
# Extra Points
- [X] 1. Add search functionality. <br><br>
- [ ] 2. Add the option to mark the task as a priority while creating-Ongoing- ``Ongoing``. <br><br>
- [X] 3. Good UI/UX + Bug-free code <br><br>

# Demo video of the working of the Application <br><br>
- [X] https://youtu.be/c4gxdtMiRrQ

![to-do-uc](https://user-images.githubusercontent.com/22853459/85010938-7c710a00-b17e-11ea-8d74-6ee63c515229.gif)

# Concepts implemented in the project
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata.html)<br><br>
- [Android Recycler view](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView)- The Recycler view code is very simple,   I am creating a RecyclerAdapter to display the Notes info on a Main Screen. My RecyclerView contains multiple notes, each of which is modified with the onBindViewHolder. The layout of each notes has many text views. I also Used Three methods into that ,The first one contains a string that is the date format. The second one contains a edit on long press at task with a delete task. The third is identical to the second, but represents the delete task. 

- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel.html)<br><br>
- [Navigation UI](https://developer.android.com/guide/navigation/navigation-ui)<br><br>
- [SQLiteDatabase](https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase) - New Note where I capture the Text and in a database, In two other activities, MySQLiteDatabase Contract and MySQLiteDatabaseHelper we create the database to store our results


## Build Apk
- [Apk](https://drive.google.com/file/d/1lCBA2qjSBGRJ7XtM3SIul4fT8YfkUKTk/view?usp=sharing)
