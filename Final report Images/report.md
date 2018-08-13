# Infrastructure Android - GSoC'18 Final Report
![Google summer of code 2018 - Systers](https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/banner.png)

I, [Anamika Tripathi](https://github.com/geekanamika/), proposed to work for [Google Summer of Code](https://summerofcode.withgoogle.com/) 2018 edition
 with [Systers Open Source](https://github.com/systers) for Infrastructure/automation Android projects.
I would like to thank [May](https://github.com/ExactlyMay), [Manju](https://github.com/manjumegh), [Nikita](https://github.com/niksj), 
[Manisha](https://github.com/manishakeim) for their guidance and support throughout the program. 

## Purpose
* Maintain consistency in Android projects throughout the community
* Follow Android standard android guidelines
* Improve Android performance (Memory leak, overdraw, cpu usage, etc)
* Improve User Interface
* Improve User Experience


You can checkout about the final presentation [here](https://www.youtube.com/watch?v=HZUwu-GiDIc&list=PLhVJyXjT75i_T-F70O0DGfz_Fu9aBpnI6&index=3&t=2s)

## Work Done
During the GSoC period, I have worked on two Android repositories:
* [PowerUp Android](http://github.com/systers/powerup-android/)
* [Malaria Android](http://github.com/systers/malaria-app-android/)

## Phase I

I worked mainly on shifting sqlite database to use Room Library - an architecture component. 
During the shifting database, I searched various ways to handle background threads in android.
I and my mentors agreed upon using Executors to handle Room queries in background.
After implementing repository pattern for PowerUp-Android database(sqlite and preferences),
I have replaced all usages of old sqlite database to Room queries.
For handling callbacks easily, I shifted all existing activities(with db usages) to Model-View-Presenter architecture.

### Accomplishments
* Completed shifting Sqlite db to use Room library
* Drafted a document for Android standard guidelines
* Replaced old database handler functions with Room's queries
* Removed redundant code, used Model-View-Presenter architecture for various activities
* Implemented Repository pattern for database usage (Room for sqlite + preferences)
* Added comments in repository for better understanding

### Demo
<p>
    <img src ="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/merged%20powerup%20work.gif" width = "500" height="250"/>
</p>

### Links
Click [here](https://github.com/systers/powerup-android/search?q=is%3Apr+author%3Ageekanamika+created%3A2018-05-14..2018-08-14&unscoped_q=is%3Apr+author%3Ageekanamika+created%3A2018-05-14..2018-08-14&type=Issues) 
to see PRs during GSoC period for PowerUp-Android

Click [here](https://github.com/systers/powerup-android/search?q=is%3Aissue+involves%3Ageekanamika+created%3A2018-05-14..2018-08-14&unscoped_q=is%3Aissue+involves%3Ageekanamika+created%3A2018-05-14..2018-08-14&type=Issues)
to see issues created during GSoC period for PowerUp-Android


## Phase II + Phase III

I started with implementing repository pattern for project. For sqlite database, I shifted it to Room Library.
Later on, I've shifted all preference usage in application to one file inside data directory. 
In next step, I started with shifting project to Model-View-Presenter architecture. Along with MVP implementation,
I have followed Material Design guidelines for user interface. In last phase, I've also measured application's performance, made relevant changes to improve performance.

### Accomplishments
* Completed shifting sqlite db to use Room library
* Implemented Repository pattern for database usage(Room for sqlite + preferences)
* Shifted project to follow MVP architecture
* Created new layouts, improved many layouts to follow material design guidelines
* Measured, improved application performance(Memory, cpu, overdraw)

### Demo + UI Comparison

  <table>
  <tr>
    <th>New Apk</th>
    <th>Old Apk</th>
  </tr>
  <tr>
      <td colspan="2" align="center"><b>User Profile</b> </td>
    </tr>
  <tr>
      <td colspan="2">
      <ul>
            <li>Allow user to add name, email, age, medicine</li>
            <li>If already submitted, provide edit option with auto-fill from preference data</li>
      </ul>
      </td>
    </tr>
  <tr>
    <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/edit_user_profile.gif"  width="300" height="500" /></td>
    <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/user_profile_old.gif"  width="300" height="500" /></td>
  </tr>
  
  
  <tr>
        <td colspan="2" align="center"><b>Plan Trip</b> </td>
  </tr>
  <tr>
        <td colspan="2">
        <ul>
              <li>Allow user to add location, departure date, arrival date, reminder time</li>
              <li>Select Item screen/dialog will provide option to add item, cash, medicines(automatically quantity calculated based on trip dates)</li>
              <li>Save data, provide options for selecting location, remind users to pack by notification on selected reminder timing</li>
        </ul>
        </td>
  </tr>
  <tr>
      <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/trip_screen.gif"  width="300" height="500" /></td>
      <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/trip_old.gif"  width="300" height="500" /></td>
  </tr>
    
  <tr>
          <td colspan="2" align="center"><b>Analysis screens</b> </td>
    </tr>
    <tr>
          <td colspan="2">
          <ul>
                <li>Displays user medication history, adherence to medicine & no. of regular doses</li>
                <li>Shifted to user icon in new implementation</li>
          </ul>
          </td>
    </tr>
    <tr>
        <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/home_screen_analysis.gif"  width="300" height="500" /></td>
        <td><img src="need to add gif here"  width="300" height="500" /></td>
    </tr> 
    
    
  <tr>
      <td colspan="2" align="center"><b>Badge screen</b> </td>
  </tr>
  <tr>
      <td colspan="2">
            <ul>
                  <li>Three types of badges availabe based on user score(taking medicines timely)</li>
                  <li>Game score(giving right answers), Plan Trip (if user plan their first trip)</li>
            </ul>
      </td>
  </tr>
  <tr>
          <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/badge_screen_notification.gif"  width="300" height="500" /></td>
          <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/badge_room_old.gif"  width="300" height="500" /></td>
  </tr>
  
  <tr>
        <td colspan="2" align="center"><b>Game screen</b> </td>
    </tr>
    <tr>
        <td colspan="2">
              <ul>
                    <li>Two games available: Rapid Fire, Myth Vs Fact</li>
                    <li>TapTargetViewer added for first time play</li>
                    <li>Medicine Store shifted to app bar, badge screen to profile screen from old app</li>
              </ul>
        </td>
    </tr>
    <tr>
        <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/play_games.gif"  width="300" height="500" /></td>
        <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/games_old.gif"  width="300" height="500" /></td>
    </tr> 
    
  <tr>
          <td colspan="2" align="center"><b>Medicine Store</b> </td>
  </tr>
  <tr>
          <td colspan="2">
                <ul>
                      <li>Allow user to add medicines to store, provide reminder on home screen with warning</li>
                      <li>Shifted to appbar in new implementation, allow user to order medicine via msg/email</li>
                </ul>
          </td>
  </tr>
  <tr>
       <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/medicine_store_warning.gif"  width="300" height="500" /></td>
       <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/medicineStore_old.gif"  width="300" height="500" /></td>
  </tr>
  
  <tr>
      <td colspan="2" align="center"><b>Home Screen</b> </td>
  </tr>
  <tr>
      <td colspan="2">
           <ul>
                <li>Allow user to set "yes" or "no" to medicine consumption</li>
                <li>set reminder tone, reset database</li>
           </ul>
      </td>
  </tr>
  <tr>
      <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/medicine_store_warning.gif"  width="300" height="500" /></td>
      <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/medicineStore_old.gif"  width="300" height="500" /></td>
  </tr>      
    
</table> 


### Performance Comparison
<table>
    <tr>
        <th>New Apk</th>
        <th>Old Apk</th>
      </tr>
    <tr>
          <td colspan="2" align="center"><b>Over Draw comparison</b> </td>
      </tr>
      <tr>
          <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/over_new_apk.gif"  width="300" height="500" /></td>
          <td><img src="https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/old_apk_overdraw.gif"  width="300" height="500" /></td>
      </tr>
</table>

#### Memory usage comparison (Android Profiler)

**New apk - memory usage**
![New apk memory usage](https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/performanceGifUpdated.gif)
 
**Old apk - memomy usage**
![Old apk memory usage](https://github.com/geekanamika/malaria-app-android/blob/finalReportImages/Final%20report%20Images/performanceOldapk.gif)




### Links
Click [here](https://github.com/systers/malaria-app-android/search?q=is%3Aissue+involves%3Ageekanamika+created%3A2018-05-14..2018-08-14&type=Issues) 
to see issues during GSoC period for Malaria-Android

Click [here](https://github.com/systers/malaria-app-android/search?p=1&q=is%3Apr+involves%3Ageekanamika+created%3A2018-05-14..2018-08-14&type=Issues&unscoped_q=is%3Apr+involves%3Ageekanamika+created%3A2018-05-14..2018-08-14)
to see PRs created during GSoC period for Malaria-Android

## Technical Aspects
- [Butterknife library]( http://jakewharton.github.io/butterknife/) to reduce the boilerplate code and make it more structured
- Constraint Layouts to develop flexible layouts and reduce overdraw
- TimeLine view to display User's data analysis in malaria-android
- TapTargetViewer to provide feature detection in malaria-android games
- Room Library to reduce boiler plate code, compile time verification 
- Repository pattern for easy database access
- Material design suggested diff types of dialogs, bottom navigation, fonts, colors, styles

## Challenges
- Research for Android best practices for every implementation
-  git merge conflicts
-  Collaboration with two GSoC student (Due to two android projects)
-  Working in background thread for Database, Callbacks 
-  Working Remotely (Primary Mentor in PST, Admin in ET )
-  Codacy errors


## Future Developements
**PowerUp-Android**

- Improve mini-games to follow MVP infrastructure 
- Shift Session History to preferences
- Improve performance (remove overdraw, reduce existing boilerplate code, etc) 

**Malaria-android**
- Add animation within fragments and activities 
- Write Unit tests
- Add feature: create Setting screen instead of resetting database by dialog
- Add feature: show list of Trips created, allow users to delete particular trip details
- Create layouts for larger devices/landscape version


## Take Away
- Learnt Android best practices (MVP, Repository pattern, etc)
- Used Libraries: Room, Butterknife, Constraint layout, TimelineView, TapTargetViewer etc
- Worked as a developer who worries about application performance
- Researched in material design guidelines 
- Used Receiver, Services, Alarm manager
- Project documentation
- Improved blogging skills ([7/13 blogs](http://medium.com/@geekanamika) published in different publications) 
- Improved Soft skills: telephonic conversation, project presentation, time management, etc 
- Remote working experience

## Important Links
- [Final Demo youtube live](https://www.youtube.com/watch?v=HZUwu-GiDIc&list=PLhVJyXjT75i_T-F70O0DGfz_Fu9aBpnI6&index=3&t=2s)
- [Final Demo powerpoint presentation](https://docs.google.com/presentation/d/1C4k81wwxbFU2T5v290TeWAMDeVRYNw7sGYpsaC2OLBE/edit?usp=sharing)
- [Malria-android Full application video](https://drive.google.com/open?id=141ZAorloucZSJ9A7xkp_9xse7WCI7UmJ)
- [Project Documentation](https://drive.google.com/open?id=1CDMo5UDnyAVoBVvAky9qasYuiacuUj_2jyM2JlJX0lA) : It'll be shifted wiki later.
- [Weekly Wiki Report](https://github.com/systers/malaria-app-android/wiki/GSoC-2018-Anamika-Tripathi)
- [Scrum check in](https://docs.google.com/document/d/15M6wRFaV1HKJ5Gz4hDYvIH_qEnV2uR44kKjPCH53nKA/edit#)
- [Meeting minutes](https://drive.google.com/open?id=1TWUzhMQCCO-C88bba4VE-75-PZNLzxOqbii4OaPhvVA)