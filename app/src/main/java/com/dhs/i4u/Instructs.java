package com.dhs.i4u;

import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.dhs.i4u.util.SpeechUtil;

public class Instructs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructs);

        StringBuilder htmlFormattedText = new StringBuilder();

        htmlFormattedText.append("<h1>Welcome to your new eyes app <BR/>I4U</h1><BR/>");

        htmlFormattedText.append("<p>I4U Helping the blind  is an app with many features to assist you in your day to day life." );
        htmlFormattedText.append(" </p>To initially use the app, you will need to be assisted by a sighted person. Once you" );
        htmlFormattedText.append(" open the app our logo will appear, after that, a pop up will ask for accessing your ");
        htmlFormattedText.append("current location, only if you press yes will you be able to continue using the app. " );
        htmlFormattedText.append("</p>Another popup that will show up, is during the process of choosing your contacts." );
        htmlFormattedText.append(" </p>A popup will be shown asking if the app can retrieve contacts from your phone, and " );
        htmlFormattedText.append("select yes to continue. </p>The first page that opens on the app consists of two buttons." );
        htmlFormattedText.append("The first button takes up half of the page, and it is the Instructions button." );
        htmlFormattedText.append( "</p This button reviews the overall setup of the app. " );
        htmlFormattedText.append("The second half of the page there is a Skip button which skips to the next layout." );
        htmlFormattedText.append("<p>The next layout has four buttons, the very first one is the Contacts, Nearby Locations,Current Location, and Voice SMS. " );
        htmlFormattedText.append(" </p>The contacts buttons is an one time setup where you can select who who want to send your SMS’s too.");
        htmlFormattedText.append("The Nearby Locations button will only work after you press the Current Location button." );
        htmlFormattedText.append("</p>After you do so, the Nearby Location button will take you to a new layout with four options." );
        htmlFormattedText.append("Which are Restaurants, Banks, Hospitals, and Grocery Stores." );
        htmlFormattedText.append( "You can choose any option and this will open to a new layout with the corresponding places." );
        htmlFormattedText.append( "</p>You can choose the exact location you would like to travel to, and when you do so google maps automatically opens  and is on walking mode so you can travel to you location.");
        htmlFormattedText.append( "The Current Location button has two features. A single click will let you know where you are and a double click will send this current location to whoever you selsted previously in the contacts." );
        htmlFormattedText.append( "</p>The Voice SMS button is a feature that takes what you speak and writes it out." );
        htmlFormattedText.append( "</p>When you click on this button it will open to a new layout and you can speak what you want to say.");
        htmlFormattedText.append("At the bottom of the new layout there is a Send SMS button.");
        htmlFormattedText.append("Whatever you have spoken will be sent as a SMS to who ever you have selected previously in the contacts.");


        ((TextView)findViewById(R.id.textView2)).setText(Html.fromHtml(htmlFormattedText.toString()));


        SpeechUtil speechUtil = new SpeechUtil(getApplicationContext());
        String textView2 = "Welcome to your new eyes app I4U : Helping the Blind ";

        speechUtil.speak(textView2);

        textView2 = " I4U Helping the blind  is an app with many" +
                "features to assist you in your day to day life ";
        speechUtil.speak(textView2);

        textView2 =       " The first page that opens on the app consists of two buttons." +
                " The first button takes up half of the page, and it is the Instructions button." +
                "This button reviews the overall setup of the app." +
                "The second half of the page there is a Skip button which skips to the next layout." +
                "The next layout has four buttons, the very first one is the Contacts, Nearby Locations,Current Location, and Voice SMS." +
                "The contacts buttons is an one time setup where you can select who who want to send your SMS’s too." +
                " The Nearby Locations button will only work after you press the Current Location button" +
                " After you do so, the Nearby Location button will take you to a new layout with four options." +
                "Which are Restaurants, Banks, Hospitals, and Grocery Stores." +
                "You can choose any option and this will open to a new layout with the corresponding places." +
                "You can choose the exact location you would like to travel to, and when you do so google maps automatically opens  and is on walking mode so you can travel to you location." +
                "The Current Location button has two features." +
                " A single click will let you know where you are and a double click will send this current location to whoever you selsted previously in the contacts." +
                "The Voice SMS button is a feature that takes what you speak and writes it out." +
                "When you click on this button it will open to a new layout and you can speak what you want to say." +
                "At the bottom of the new layout there is a Send SMS button." +
                " Whatever you have spoken will be sent as a SMS to who ever you have selected previously in the contacts. ";
        speechUtil.speak(textView2);
        // this code is for when the person clicks on the instruction button on the main activity xml

    }
}
