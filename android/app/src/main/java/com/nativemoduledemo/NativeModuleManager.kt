package com.nativemoduledemo

import android.widget.Toast
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod


class NativeModuleManager(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {

    @ReactMethod
    fun doSomethingInNative() {
        print("Hi, I'm written in Native code, and beign consumed in react-native code.")
    }

    @ReactMethod
    fun doSomethingGiveBack(callback: Callback) {
        callback.invoke("Hi, I'm written in Native code, and beign consumed in react-native code.")
    }

    override fun getConstants(): Map<String, Any>? {
        val constants: MutableMap<String, Any> = HashMap()
        constants["number"] = 90
        constants["string"] = "hello from static data"
        constants["bool"] = true
        return constants
    }


    override fun getName(): String {
        return "NativeModuleManager";
    }
}