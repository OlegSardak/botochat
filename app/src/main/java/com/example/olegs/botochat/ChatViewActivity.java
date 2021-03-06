package com.example.olegs.botochat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChatViewActivity extends  RecyclerView.ViewHolder {

        LinearLayout leftMsgLayout;

        LinearLayout rightMsgLayout;

        TextView leftMsgTextView;

        TextView rightMsgTextView;

        ImageView imageMessageBot;
        ImageView imageMessageUser;

        TextView textMessageUser;
        TextView textMessageBot;

public ChatViewActivity(View itemView) {
        super(itemView);

        if(itemView!=null) {
        leftMsgLayout = (LinearLayout) itemView.findViewById(R.id.chat_left_msg_layout);
        rightMsgLayout = (LinearLayout) itemView.findViewById(R.id.chat_right_msg_layout);
        leftMsgTextView = (TextView) itemView.findViewById(R.id.chat_left_msg_text_view);
        rightMsgTextView = (TextView) itemView.findViewById(R.id.chat_right_msg_text_view);

                imageMessageUser = (ImageView) itemView.findViewById(R.id.image_message_user);
                textMessageUser = (TextView) itemView.findViewById(R.id.text_message_user);
                imageMessageBot = (ImageView) itemView.findViewById(R.id.image_message_bot);
                textMessageBot = (TextView) itemView.findViewById(R.id.text_message_bot);
        }
        }
        }
