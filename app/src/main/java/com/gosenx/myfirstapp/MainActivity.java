package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("Finish the Spring Developer course", true));
        todoList.add(new Todo("Plan app development for the next 2 weeks", true));
        todoList.add(new Todo("Set my hourly rate", false));

        RecyclerView rvTodos = findViewById(R.id.rvTodos);
        Button btnTodo = findViewById(R.id.btnAddTodo);

        TodoAdapter todoAdapter = new TodoAdapter(todoList);
        rvTodos.setAdapter(todoAdapter);
        rvTodos.setLayoutManager(new LinearLayoutManager(this));

        btnTodo.setOnClickListener(e -> {
            TextView tvTitle = findViewById(R.id.edTodo);
            String title = tvTitle.getText().toString();
            Todo todo = new Todo(title, false);

            todoList.add(todo);
            // todoAdapter.notifyDataSetChanged(); - This can also be used but is expensive because checks all the items in the recycler view
            todoAdapter.notifyItemInserted(todoList.size() - 1);
        });
    }
}