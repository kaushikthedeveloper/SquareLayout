# SquareLayout
Provide a wrapper class for creating Square dimensioned ViewGroups of the various layouts used in Android.

<img src="https://github.com/kaushikthedeveloper/SquareLayout/blob/master/art/SquareRelativeLayout%20-%20vertical.png?raw=true">
<img src="https://github.com/kaushikthedeveloper/SquareLayout/blob/master/art/SquareRelativeLayout%20-%20Horizontal.png?raw=true">

## Usage

Add this to your build.gradle:
```
repositories {
    maven {
        url "https://maven.google.com"
    }
}

dependencies {
    compile 'com.github.kaushikthedeveloper:squarelayout:0.0.1'
}
```

Add the different SquareLayoutViews to your layout :
```
    <com.kaushikthedeveloper.squarelayout.SquareLinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        ...
        />
```

### Square Layouts Supported :
  - SquareFrameLayout
  - SquareGridLayout
  - SquareLinearLayout
  - SquareRelativeLayout
  - SquareTableLayout
  - ~~SquarePercentFrameLayout~~    (deprecated)
  - ~~SquarePercentRelativeLayout~~ (deprecated)
 