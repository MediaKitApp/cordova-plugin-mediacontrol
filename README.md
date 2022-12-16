# Cordova Plugin Media Controls


Enable speaker mode and correctly display the multimedia volume when lowering or raising.

Although the object is attached to the global scoped `window`, it is not available until after the `deviceready` event.

* Cordova 
```js
document.addEventListener("deviceready", onDeviceReady, false);
function onDeviceReady() {
  console.log(MediaControls);
}
```
    
* Ionic
 ```js
 /* Create interface for working */
window.MediaControls.setModeAudio(...) 
```
    
## Install Ionic / Cordova

* Cordova
```bash
npm i cordova-plugin-media-control
cordova plugin add cordova-plugin-media-control
```
* Ionic
```bash
npm i cordova-plugin-media-control
npx cap sync
```


# Permissions Android
```xml
<uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS" />
```



## API

<docgen-index>

* [`MediaControls.setModeAudio(...)`](#setmodeaudio)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### setModeAudio(...)

```typescript
setModeAudio(mode: string) => Promise<{ state: boolean; }>
```

| Param         | Type                           | Description                      |
| ------------- | ------------------------------ | -------------------------------- |
| **`mode`** | <code>string</code> | Value <code>speaker</code> for active Speaker or <code>normal</code> for disabled

**Returns:** <code>Promise&lt;{ state: boolean; }&gt;</code>

--------------------

</docgen-api>
