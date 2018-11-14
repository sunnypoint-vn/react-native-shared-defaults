//
//  UserDefaultsManager.h
//  RNUserDefaults
//
//  Created by HTSI on 9/6/17.
//  Copyright © 2017 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface UserDefaultsManager : NSObject

+ (id)allObjects;

+ (void)setObject:(id)object forKey:(NSString *)key;

+ (void)setBool:(bool)value forKey:(NSString *)key;

+ (void)removeObjectForKey:(NSString *)key;

+ (NSArray *)arrayForKey:(NSString *)key;

+ (NSString *)stringForKey:(NSString *)key;

+ (id)objectForKey:(NSString *)key;

+ (bool)boolForKey:(NSString *)key;

@end
