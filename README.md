Android **Notes App** demonstrating **SQLite** database.

To-do Application
Overview
Build an Android application where the user can save their upcoming tasks. And then can later check them off when the task is done. The tasks should be saved on the user’s device. Below is a rough design of the application.  

This design is just for your reference and not a final design. Below is a more detailed description of what’s required.
What’s required
The android app should have the following features:
New Task Button - This button is present on the AppBar, clicking on this button should open a dialog box showing text input for the task and a Submit button.
Clicking the Submit button should save the task in the SQLite database.
There should be a RecyclerView displaying the list of Tasks and a “Check” button. Clicking the “Check” button will mark the task’s state as complete. The text in the task should strikethrough at this point. 
Once the task is marked complete, there should be two buttons in place of the “Check” button. These buttons are “Undo” and “Delete”. Clicking on the Undo button will mark the task’s state as incomplete again (the text in the task will not be strikethrough now). Clicking on the Delete button will remove the task from the list.
All these states/actions should be saved in the SQLite database.

