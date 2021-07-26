package com.gosenx.myfirstapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {

    private List<Todo> todos;

    public TodoAdapter(List<Todo> todos) {
        this.todos = todos;
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_todo, parent, false);
        return new TodoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.TodoViewHolder holder, int position) {
        holder.getTextView().setText(todos.get(position).getTitle());
        holder.getCheckBox().setChecked(todos.get(position).isChecked());
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }

    public static class TodoViewHolder extends RecyclerView.ViewHolder {

        public TodoViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public TextView getTextView() {
            return itemView.findViewById(R.id.tvTitle);
        }

        public CheckBox getCheckBox() {
            return itemView.findViewById(R.id.cbDone);
        }
    }
}
