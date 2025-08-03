package eu.icole.portainer.dtos.openamt;

import eu.icole.portainer.dtos.portainer.OpenAMTDeviceEnabledFeatures;

public class DeviceFeaturesPayload {

    private OpenAMTDeviceEnabledFeatures features;

    public DeviceFeaturesPayload() {
    }

    public DeviceFeaturesPayload(OpenAMTDeviceEnabledFeatures features) {
        this.features = features;
    }

    public OpenAMTDeviceEnabledFeatures getFeatures() {
        return features;
    }

    public void setFeatures(OpenAMTDeviceEnabledFeatures features) {
        this.features = features;
    }

}