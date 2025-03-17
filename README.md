# UnderlinedTextView - A Custom Android TextView with Optional Underline

## English

### 📌 Overview
UnderlinedTextView is a custom Android `TextView` that allows you to dynamically enable or disable an underline.

### ✨ Features
- Toggle underline dynamically via code.
- Uses `currentTextColor` to match underline color with text.
- Lightweight and easy to integrate.

### 📖 Usage
```kotlin
val textView = findViewById<UnderlinedTextView>(R.id.myUnderlinedTextView)

// Enable underline
textView.setUnderlineEnabled(true)

// Disable underline
textView.setUnderlineEnabled(false)

