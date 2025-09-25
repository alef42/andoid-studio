# SoluCXWebKiosk

Kiosk-style WebView app that opens a fixed URL in full screen and disables long-press/share/download.

## Build
1. Open this folder in **Android Studio**.
2. Let it sync Gradle automatically.
3. Go to **Build > Build Bundle(s)/APK(s) > Build APK(s)**.
4. The APK will be at `app/build/outputs/apk/`.

## Customize
- URL is defined in `app/src/main/java/br/com/solucx/kiosk/MainActivity.kt` (search for `loadUrl`).
- Package: `br.com.solucx.kiosk`.
- Min SDK 24.

## Notes
- Long press/context menu disabled.
- Downloads/uploads blocked.
- Only domain `survey.preview.solucx.com.br` allowed in WebView.
