/**
* Lightify Child - Switch (0.21)
*
*  Author: 
*    Adam Kempenich
*
*  Documentation:  [Does not exist, yet]
*
*  Changelog:
*    0.21 (Feb 10, 2020)
*        - Initial Commit
*
*  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License. You may obtain a copy of the License at:
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
*  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
*  for the specific language governing permissions and limitations under the License.
*
*/

metadata {
definition (
    name: "Lightify Bulb - Switch", 
    namespace: "Lightify", 
    author: "Adam Kempenich",
    importUrl: "https://raw.githubusercontent.com/adamkempenich/hubitat/master/Drivers/Lightify/(Child)%20Lightify%20Bulb%20-%20Switch.groovy") {
    
        capability "Actuator"
		capability "Initialize"
        capability "Polling"
        capability "Refresh"
		capability "Sensor"
		capability "Switch"
	}
}

def on(){
    sendEvent(name: "switch", value: "on")
    parent.on(device.deviceNetworkId)
}
def off(){
    sendEvent(name: "switch", value: "on")
    parent.off(device.deviceNetworkId)
}


def initialize(){
    // Do nothing
}

def updated(){
    // Do nothing
}
