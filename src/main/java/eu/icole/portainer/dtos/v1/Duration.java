package eu.icole.portainer.dtos.v1;

import com.google.gson.annotations.SerializedName;

public class Duration {

    @SerializedName("time.Duration")
    private Integer timeDuration;

    public Duration() {
    }

    public Duration(Integer timeDuration) {
        this.timeDuration = timeDuration;
    }

    public Integer getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(Integer timeDuration) {
        this.timeDuration = timeDuration;
    }

}