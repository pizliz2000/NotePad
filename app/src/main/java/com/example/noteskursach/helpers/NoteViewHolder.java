package com.example.noteskursach.helpers;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteskursach.R;

public class NoteViewHolder extends RecyclerView.ViewHolder {

    View mView;
    TextView textTitle, textTime;
    public CardView noteCard;

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);

        mView = itemView;
        textTitle = mView.findViewById(R.id.note_title);
        textTime = mView.findViewById(R.id.note_time);
        noteCard=mView.findViewById(R.id.note_card);
    }

    public void setNoteTitle(String title) {
        textTitle.setText(title);
    }

    public void setNoteTime(String time) {
        textTime.setText(time);
    }


}
