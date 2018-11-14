//
//  UserDefaultsManager.m
//  RNUserDefaults
//
//  Created by HTSI on 9/6/17.
//  Copyright © 2017 Facebook. All rights reserved.
//

#import "UserDefaultsManager.h"

@implementation UserDefaultsManager

+ (id)allObjects {
  return [[NSUserDefaults standardUserDefaults] dictionaryRepresentation];
}

+ (void)setObject:(id)object forKey:(NSString *)key {
  
  [[NSUserDefaults standardUserDefaults] setObject:object forKey:key];
}

+ (void)setBool:(bool)value forKey:(NSString *)key {
  
  [[NSUserDefaults standardUserDefaults] setBool:value forKey:key];
}

+ (void)removeObjectForKey:(NSString *)key {
  
  [[NSUserDefaults standardUserDefaults] removeObjectForKey:key];
}

+ (NSArray *)arrayForKey:(NSString *)key {
  
  return [[NSUserDefaults standardUserDefaults] arrayForKey:key];
}

+ (NSString *)stringForKey:(NSString *)key {
  
  return [[NSUserDefaults standardUserDefaults] stringForKey:key];
}

+ (id)objectForKey:(NSString *)key {
  
  return [[NSUserDefaults standardUserDefaults] objectForKey:key];
}

+ (bool)boolForKey:(NSString *)key {
  
  return [[NSUserDefaults standardUserDefaults] boolForKey:key];
}

@end
