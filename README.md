# STYLEABLE SNACKBAR

[![Download](https://jitpack.io/v/xavijimenezmulet/StyleableSnackBar.svg)](https://jitpack.io/#xavijimenezmulet/StyleableSnackBar)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19)
![Build Status](https://github.com/Dhaval2404/ImagePicker/workflows/Build/badge.svg)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://opensource.org/licenses/Apache-2.0)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/xavijimenezmulet/save_null_extension_kotlin/blob/main/LICENSE)

[![ko-fi](https://www.ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/xavijimenez)

## 💥Presentation

This library is used to control an attribute if it comes to null, what it will do is remove that null and give it a default value. Ideal for dealing with business models where attributes can be nullable.

<img src="https://user-images.githubusercontent.com/44567433/171025845-bd0b31e8-0db8-49a3-b845-09c5cd6157ff.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025872-c6ea89c2-3575-4fb0-9659-497cf83d16c6.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025901-747838f2-9033-4f0d-a3f2-9795084cd1df.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025910-c56b8c51-14e2-4af5-b616-f4f0ad145736.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025941-54d0dbe8-4e2f-437e-8d0b-d6f8b2917452.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025945-94ae37d7-e16b-4fb4-8e9b-d18732a8a852.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025961-f59d5ace-5087-480e-a3af-2a7e62c2d390.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025964-03810705-123f-4fb8-9af9-adb9350b9b2a.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171025998-e0fb8433-1957-47ed-93c6-dcfd4cb26e20.gif" width="250" height="500"/> <img src="https://user-images.githubusercontent.com/44567433/171026010-e4d989a8-b8ed-4ae1-802d-4ef31e28bf1f.gif" width="250" height="500"/>

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

If you have a class where null attributes can come. The library helps prevent them in a single line without having to check them.
Let's add an example class:

```kotlin
data class Example(
    val byte: Byte?,
    val short: Short?,
    val int: Int?,
    val long: Long?,
    val float: Float?,
    val double: Double?,
    val char: Char?,
    val string: String?,
    val boolean: Boolean?,
    val list: List<String>?,
    val mutableList: MutableList<String>?,
    val array: Array<String>?
)
```

Now we are going to show an example of an extension, for example of string:

```kotlin
fun String?.saveNull(defaultValue: String = ""): String {
    return this ?: defaultValue
}
```

If we look at the extension it controls that a string can be nullable. If the string is not nullable, it returns the attribute itself. But on the contrary, if it is nullable, it will return the default value (By default it will be empty string).
All extensions have a default value that we can modify to our liking if we want.

Now let's show an example with the "Example" class:

```kotlin
private fun initExample() {
  val example = Example()
  val text: String = example.string.saveNull("No available")
  textView.text = text
}
```

The value of "text" will always have a value. It can be the string attribute of the Example class if it is not null.
If it is, we have added a default value that says "not available" so the textView will always show a result.


# ✔️Changelog

### Version: 1.0

  * Initial Build

## License
[APACHE LICENSE 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt)
