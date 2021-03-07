//
//  NativeModuleManager.m
//  NativeModuleDemo
//
//  Created by Ahsan Ali on 06/03/2021.
//

#import <Foundation/Foundation.h>
#import "React/RCTBridgeModule.h"

@interface RCT_EXTERN_MODULE(NativeModuleManager, NSObject)

RCT_EXTERN_METHOD(doSomethingInNative)
RCT_EXTERN_METHOD(doSomethingGiveBack: (RCTResponseSenderBlock)callback)

@end
