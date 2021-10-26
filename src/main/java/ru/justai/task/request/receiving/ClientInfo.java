package ru.justai.task.request.receiving;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class ClientInfo {

    @JsonProperty("button_actions")
    private List<String> buttonActions;

    @JsonProperty("keyboard")
    private Boolean keyboard;

    @JsonProperty("inline_keyboard")
    private Boolean inlineKeyboard;

    @JsonProperty("carousel")
    private Boolean carousel;

    @JsonProperty("lang_id")
    private Integer langId;

    public List<String> getButtonActions() {
        return buttonActions;
    }

    public void setButtonActions(List<String> buttonActions) {
        this.buttonActions = buttonActions;
    }

    public Boolean getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Boolean keyboard) {
        this.keyboard = keyboard;
    }

    public Boolean getInlineKeyboard() {
        return inlineKeyboard;
    }

    public void setInlineKeyboard(Boolean inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }

    public Boolean getCarousel() {
        return carousel;
    }

    public void setCarousel(Boolean carousel) {
        this.carousel = carousel;
    }

    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientInfo that = (ClientInfo) o;
        return Objects.equals(buttonActions, that.buttonActions) && Objects.equals(keyboard, that.keyboard) && Objects.equals(inlineKeyboard, that.inlineKeyboard) && Objects.equals(carousel, that.carousel) && Objects.equals(langId, that.langId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttonActions, keyboard, inlineKeyboard, carousel, langId);
    }

    @Override
    public String toString() {
        return "ClientInfo{" +
                "buttonActions=" + buttonActions +
                ", keyboard=" + keyboard +
                ", inlineKeyboard=" + inlineKeyboard +
                ", carousel=" + carousel +
                ", langId=" + langId +
                '}';
    }
}
