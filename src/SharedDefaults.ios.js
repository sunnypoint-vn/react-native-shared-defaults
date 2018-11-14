/**
 * @providesModule RNSharedDefaults
 * @flow
 */
'use strict';
import { NativeModules } from 'react-native';

var RNSharedDefaults = NativeModules.RNSharedDefaults;
var Promise = require('bluebird'); // jshint ignore:line
/**
* High-level docs for the RNUserDefaults iOS API can be written here.
*/
var _setObjectForKey = Promise.promisify(RNSharedDefaults.setObjectForKey);
var _setBoolForKey = Promise.promisify(RNSharedDefaults.setBoolForKey);

var _arrayForKey = Promise.promisify(RNSharedDefaults.arrayForKey);
var _stringForKey = Promise.promisify(RNSharedDefaults.stringForKey);
var _objectForKey = Promise.promisify(RNSharedDefaults.objectForKey);
var _boolForKey = Promise.promisify(RNSharedDefaults.boolForKey);


var _removeItemForKey = Promise.promisify(RNSharedDefaults.removeObjectForKey);
var _allObjects = Promise.promisify(RNSharedDefaults.allObjects);

var SharedDefaults = {
    allObjects() {
        return _allObjects();
    },
    setArrayForKey(array, key) {
        return _setObjectForKey(array, key);
    },
    setString(string, key) {
        return _setObjectForKey(string, key);
    },
    setObject(object, key) {
        return _setObjectForKey(object, key);
    },
    setBool(bool, key) {
        return _setBoolForKey(bool, key);
    },
    getArray(key) {
        return _arrayForKey(key);
    },
    getString(key) {
        return _stringForKey(key);
    },
    getObject(key) {
        return _objectForKey(key);
    },
    getBool(key) {
        return _boolForKey(key);
    },
    deleteKey(key) {
        return _removeItemForKey(key);
    }
};

module.exports = SharedDefaults;
