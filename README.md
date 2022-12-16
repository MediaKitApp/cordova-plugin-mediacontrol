# Cordova Plugin Media Controls


Enable speaker mode and correctly display the multimedia volume when lowering or raising.

## Install Ionic / Cordova

```bash
npm i https://github.com/Spearking/cordova-plugin-mediacontrol --force
npx cap sync
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
