# STYLEABLE SNACKBAR

[![Download](https://jitpack.io/v/xavijimenezmulet/StyleableSnackBar.svg)](https://jitpack.io/#xavijimenezmulet/StyleableSnackBar)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19)
![Build Status](https://github.com/Dhaval2404/ImagePicker/workflows/Build/badge.svg)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://opensource.org/licenses/Apache-2.0)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/xavijimenezmulet/StyleableSnackBar/blob/main/LICENSE)

[![ko-fi](https://www.ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/xavijimenez)

## 💥Presentation

Using the native android class of snack bar. This custom snack bar will help you display much more personalized app toast. You can change the color, add an icon, outline on the toast and much more.

<img src="https://user-images.githubusercontent.com/44567433/171025845-bd0b31e8-0db8-49a3-b845-09c5cd6157ff.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025872-c6ea89c2-3575-4fb0-9659-497cf83d16c6.gif" width="250" height="500"/> 

Success SnackBar

<img src="https://user-images.githubusercontent.com/44567433/171025901-747838f2-9033-4f0d-a3f2-9795084cd1df.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025910-c56b8c51-14e2-4af5-b616-f4f0ad145736.gif" width="250" height="500"/> 

Failure SnackBar

<img src="https://user-images.githubusercontent.com/44567433/171025941-54d0dbe8-4e2f-437e-8d0b-d6f8b2917452.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025945-94ae37d7-e16b-4fb4-8e9b-d18732a8a852.gif" width="250" height="500"/> 

Warning SnackBar

<img src="https://user-images.githubusercontent.com/44567433/171025961-f59d5ace-5087-480e-a3af-2a7e62c2d390.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025964-03810705-123f-4fb8-9af9-adb9350b9b2a.gif" width="250" height="500"/> 

Info SnackBar

<img src="https://user-images.githubusercontent.com/44567433/171025998-e0fb8433-1957-47ed-93c6-dcfd4cb26e20.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171026010-e4d989a8-b8ed-4ae1-802d-4ef31e28bf1f.gif" width="250" height="500"/>

Custom SnackBar

## 💥Installation

Step 1. Add it in your root build.gradle at the end of repositories:

```bash
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency:

```bash
dependencies {
	implementation "com.github.xavijimenezmulet:StyleableSnackBar:$latest_version"
}
```

## 💻Usage

Two types of snack bar can be used. By type or custom:

# Type

These are the existing types:

```kotlin
enum class Type {
 SUCCESS, FAILURE, WARNING, INFORMATION
}
```

You should call this method from StyleableSnackBar:


```kotlin
/**
 * Creates a snackBar instance with custom duration and color
 * @param viewGroup view group of the caller
 * @param text to be used as the message
 * @param type specifies the image and background to be prompted
 * @param long duration of snackBar false if you want short
 * @param context current context
 * @param showImage to show image (optional) default is true
*/
fun snack(
	 viewGroup: ViewGroup,
	 text: String?,
	 type: Type,
	 long: Boolean,
	 context: Context,
	 showImage: Boolean = true
)
```

Now we are going to show an example of snack bar setting to FAILURE with image:

```kotlin
StyleableSnackBar.snack(
	 requireActivity().window.decorView.rootView as ViewGroup,
	 "Custom Snack Bar",
	 StyleableSnackBar.Type.FAILURE,
	 true,
	 requireContext()
)
```

This will show a failure snack bar with failure icon (you can look on presentation gifts).

# Custom
You should call this method from StyleableSnackBar:

```kotlin
/**
 * Creates a custom snackbar with the selected elements
 * @param viewGroup view group of the caller
 * @param text to be used as the message
 * @param backgroundColor the snackBar background color
 * @param image image to be used in the snackBar (optional)
 * @param tintImage color of image set (optional)
 * @param long duration of snackBar false if you want short
 * @param strokeColor the outline color (optional)
 * @param strokeWidth the outline width (optional)
*/
fun customSnack(
            viewGroup: ViewGroup,
            text: String?,
            backgroundColor: Int = R.color.black,
            image: Int? = null,
            tintImage: Int = R.color.white,
            long: Boolean,
            strokeWidth: Int = 0,
            strokeColor: Int = R.color.black,
            context: Context
)
```

Now we are going to show an example of custom snack bar:

```kotlin
StyleableSnackBar.customSnack(
	 requireActivity().window.decorView.rootView as ViewGroup,
	 "Custom Snack Bar",
	 R.color.purple_500,
	 R.drawable.ic_launcher_foreground,
	 R.color.white,
	 true,
	 2,
	 R.color.styleableYellow,
	 requireContext()
)
```

You can download the code and try the example as shown in the presentation part.


# ✔️Changelog

### Version: 1.0

  * Initial Build

## License
[APACHE LICENSE 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt)
