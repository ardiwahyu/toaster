# Toaster
[![](https://jitpack.io/v/ardiwahyu/toaster.svg)](https://jitpack.io/#ardiwahyu/toaster)
## Installation
```gradle
    implementation 'com.github.ardiwahyu:toaster:1.0.1'
```
## Usage
* Error toast
```kotlin
  Toaster.errorToast(this, "Pesan yang akan ditampilkan")
```
or
```kotlin
  Toaster.longErrorToast(this, "Pesan yang akan ditampilkan")
```
preview</br></br>
<img src="https://github.com/ardiwahyu/toaster/blob/master/image/error.jpg" width="356" height="200">

* Warning toast
```kotlin
  Toaster.warningToast(this, "Pesan yang akan ditampilkan")
```
or
```kotlin
  Toaster.longWarningToast(this, "Pesan yang akan ditampilkan")
```
preview</br></br>
<img src="https://github.com/ardiwahyu/toaster/blob/master/image/warning.jpg" width="356" height="200">

## Methods
* defaultToast
* longDefaultToast
* successToast
* longSuccessToast
* errorToast
* longErrorToast
* warningToast
* longWarningToast
* customToast

## Custom colors
Override this colors:
* toastSuccessBgColor
* toastSuccessTextColor
* toastWarningBgColor
* toastWarningTextColor
* toastErrorBgColor 
* toastErrorTextColor 
