# Native Modules for React Native

React Native - Native Modules Communication


Sometimes, we have to access native platforms APIs that are not available in Javascript.

For example, the integration of some custom hardware device with our application using Bluetooth. In this case, we have to use native API code for the Bluetooth module for both platforms, Java/Kotlin for Android and Objective-C/Swift for iOS.

There might be a case where you want to use your existing code implementation written in Objective-C, Java, Kotlin, or Swift in your React Native application, or you want to write some high-performance, multi-threaded code for things like video processing, machine learning, etc.

The Native Module system allows us to use native APIs code written in Java, Kotlin, Objective-C, and Swift with JS code. Native module works as a bridge between native APIs and React Native code, allowing us to run native APIs code within JS, send data to native APIs, and receive data from native APIs.

In this article, we will build the architecture to implement native modules in React Native.

These are the main steps that we are going to implement in the article.
1. Creating React Native Project - We will create a new React Native project for consuming native APIs code.
2. Creating Native Module - We will create a native module in android and iOS projects one after another.
3. Exposing Native Module - We will expose the native-module written in native code to react-native (JS) code.
4. Registering the Module (Android) - We will register the native module for android.
5. Testing -  We will test out the exported native modules in our react-native application.
 
Let’s get it started!

Chekcout my article, complete guide on react-native modules communication.

https://around25.com/blog/how-to-write-native-modules-for-react-native/
