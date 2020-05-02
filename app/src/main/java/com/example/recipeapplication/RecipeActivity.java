package com.example.recipeapplication;
import androidx.appcompat.app.AppCompatActivity;;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
public class RecipeActivity extends AppCompatActivity {
    private TextView mRecipeName;
    private TextView mRecipeIngredients;
    private TextView mRecipeMethodTitle;
    private TextView mRecipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipeName = (TextView)findViewById(R.id.text_recipe);
        mRecipeIngredients = (TextView)findViewById(R.id.ingredients);
        mRecipeMethodTitle = (TextView)findViewById(R.id.method);
        mRecipe = (TextView)findViewById(R.id.recipe);

        Intent intent = getIntent();
        String NameTitle = intent.getExtras().getString("Name");
        String Ingredients = intent.getExtras().getString("Ingredients");
        String MethodTitle = intent.getExtras().getString("MethodTitle");
        String Recipe = intent.getExtras().getString("Recipe");

        mRecipeName.setText(NameTitle);
        mRecipeIngredients.setText(Ingredients);
        mRecipeMethodTitle.setText(MethodTitle);
        mRecipe.setText(Recipe);
    }
}
