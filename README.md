# Search and cal a driver test

## Dependencies for running locally 
  * Gradle
  * Android sdk (API level 26) 
  * Java 8
  * One emualtor working on machine (run ```adb devices```)
  
  
## Run tests: 
  * Under "Android demo" folder, run ```./gradlew connectedAndroidTest```
  
  
  Comments: 
   * BasePage is not being used. when proejct gets bigger it's possible to add internal and customed methods (which covers the core Espresso methods for typing / clicking etc.. ) and by that, remove all imports from other pages. 
