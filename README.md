# SquareLayout
Provide a wrapper class for creating Square dimensioned ViewGroups of the various layouts used in Android.

<img src="https://github.com/kaushikthedeveloper/SquareLayout/blob/master/art/SquareRelativeLayout%20-%20vertical.png?raw=true" width="300" height="580"> 
<br />
<img src="https://github.com/kaushikthedeveloper/SquareLayout/blob/master/art/SquareRelativeLayout%20-%20Horizontal.png?raw=true" width="680" height="340">

## Usage

Add this to your build.gradle:
```gradle
repositories {
    maven {
        url "https://maven.google.com"
    }
}

dependencies {
    compile 'com.github.kaushikthedeveloper:squarelayout:0.0.3'
}
```

Add the different SquareLayoutViews to your layout (Minimalistic Layout shown below) :
```xml
<com.kaushikthedeveloper.squarelayout.SquareLinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
/>
```

The min version for ```Support Library``` requires version "26.+"

## Features :
  - Square Layout dimensions calculated before View is rendered.
  - No extra cost, nor any re-rendering processes involved.
  - Basic Layout methods remain untouched and can be accessed.


### Square Layouts Supported :
  - SquareFrameLayout
  - SquareGridLayout
  - SquareLinearLayout
  - SquareRelativeLayout
  - SquareTableLayout
  - ~~SquarePercentFrameLayout~~    (deprecated)
  - ~~SquarePercentRelativeLayout~~ (deprecated)
  

**Note :** the Preview of the XML for SquareLayouts is broken for the moment (due to the method used for rendering perfect Square in all situations), though this in no way affects the Performance nor the rendering of the Layouts.
 
