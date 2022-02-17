package com.mrmindteam.syriancards.SpinnerCustom;

public class CustomSpinnerItem {
    private String cardName;
    private int cardImage;

    public CustomSpinnerItem(String cardName, int cardImage) {
        this.cardName = cardName;
        this.cardImage = cardImage;
    }

    public CustomSpinnerItem(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public int getProviderImage() {
        return cardImage;
    }
}
