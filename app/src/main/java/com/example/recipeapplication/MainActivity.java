package com.example.recipeapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView myrecycleView;
    RecyclerViewAdapter myAdapter;
    List<Recipes>recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1=new ArrayList<>();
        recipes1.add(new Recipes("ChickenRoll","200 gm chopped into cubes chicken\n" +
                "1 medium chopped tomato\n" +
                "1/2 pinch red chilli powder\n" +
                "2 tablespoon vegetable oil\n" +
                "1/2 cut into strips cucumber\n" +
                "1/2 tablespoon chopped coriander leave",
                "Method","tep 1\n" +
                "Preheat oven to 400 degrees F (200 degrees C).\n" +
                "\n" +
                " Step 2\n" +
                "Place each chicken breast half between sheets of plastic wrap and pound with a meat mallet to about 1/8 inch thickness. Place a finger of cheese on each ham slice and sprinkle lightly with thyme and salt and pepper to taste. Roll up seasoned ham and cheese 'jellyroll-style', then roll each chicken breast with ham and cheese inside. Tuck in ends and fasten with toothpicks.\n" +
                "\n" +
                " Step 3\n" +
                "Place melted butter in a small bowl and place cereal crumbs in a shallow dish or bowl. Dip each chicken roll in butter or margarine, then roll in crumbs, turning to coat thoroughly. Place coated rolls in a lightly greased 9x13 inch baking dish.\n" +
                "\n" +
                " Step 4\n" +
                "Bake at 400 degrees F (200 degrees C) for about 40 minutes or until chicken is golden brown and juices run clear. Serve with cordon bleu sauce, if desired.\n" +
                "\n" +
                " Step 5\n" +
                "To Make Cordon Bleu Sauce: In a small saucepan mix together the soup, sour cream and lemon juice. Heat over low heat, stirring occasionally, and serve hot over chicken rolls. Makes about 2 cups; 8 servings of 1/4 cup each.",R.drawable.chickenroll));
        recipes1.add(new Recipes("Pasta","1 28-ounce can whole peeled tomatoes\n" +
                "\n" +
                "2 tablespoons extra-virgin olive oil\n" +
                "\n" +
                "1/3 red onion, medium-diced\n" +
                "\n" +
                "3 cloves garlic, cut into chunks\n" +
                "\n" +
                "Pinch of red pepper flakes (optional)\n" +
                "\n" +
                "Kosher salt and freshly ground pepper\n" +
                "\n" +
                "2 tablespoons torn fresh basil\n" +
                "\n" +
                "1 pound penne or spaghetti, cooked until al dente","Method","Gather the ingredients.\n" +
                "\n" +
                "Heat the olive oil in a large saucepan over medium heat. Add the onion and garlic, and cook for 5 minutes.\n" +
                "\n" +
                "Add the tomatoes, tomato paste, oregano, basil, and, if using, red pepper flakes. Add salt and pepper and bring sauce to a simmer.\n" +
                "\n" +
                "Reduce heat to medium-low and simmer until sauce thickens slightly—about 20 minutes.",R.drawable.pasta));
        recipes1.add(new Recipes("Pancakes"," 1 cup all-purpose flour\n" +
                "2 tablespoons white sugar\n" +
                "2 teaspoons baking powder\n" +
                "1 teaspoon salt1 egg, beaten\n" +
                "1 cup milk\n" +
                "2 tablespoons vegetable ","Method","Combine the ingredients in a wide-mouth jar. Place the milk, egg, and oil in a quart jar first. Add the flour, sugar, baking powder, and salt.\n" +
                "Seal the jar tightly and shake to combine. Seal the jar and shake the jar vigorously for at least 2 minutes. Don’t stress about any small lumps in the batter.\n" +
                "Set the batter aside while you heat a pan. Set the batter side for 10 minutes. Meanwhile, heat a large cast iron or nonstick skillet over medium-high heat.\n" +
                "Fry 3 pancakes for 2 to 3 minutes. Add 1 teaspoon of vegetable oil to the pan and swirl to coat. Add 2-tablespoon portions of the batter to the pan, cooking 3 at a time. Cook on the first side until bubbles appear on the surface, the edges begin to look dry, and the bottoms are golden-brown, about 3 minutes.\n" +
                "Flip and cook for another 2 to 3 minutes. Flip the pancakes. Cook until the second sides are golden-brown, 2 to 3 minutes more. Transfer to a warm oven or plate. Repeat using the remaining oil and cooking the remaining batter.",R.drawable.pancake));
         recipes1.add(new Recipes("Donuts","1 c. whole milk\n" +
                 "1/4 c. plus 1 tsp. granulated sugar, divided\n" +
                 "1 packet (or 2 1/4 tsp.) active dry yeast \n" +
                 "4 1/2 c. all-purpose flour, plus more for surface\n" +
                 "1/2 tsp. kosher salt\n" +
                 "6 tbsp. melted butter\n" +
                 "2 large eggs\n" +
                 "1/2 tsp. pure vanilla extract\n" +
                 "Canola or vegetable oil, for frying\n" +
                 "FOR GLAZE\n" +
                 "1/4 c. whole milk\n" +
                 "2 c. powdered sugar\n" +
                 "1/2 tsp. pure vanilla extract\n","Method","Combine the ingredients in a wide-mouth jar. Place the milk, egg, and oil in a quart jar first. Add the flour, sugar, baking powder, and salt.\n" +
                 "Seal the jar tightly and shake to combine. Seal the jar and shake the jar vigorously for at least 2 minutes. Don’t stress about any small lumps in the batter.\n" +
                 "Set the batter aside while you heat a pan. Set the batter side for 10 minutes. Meanwhile, heat a large cast iron or nonstick skillet over medium-high heat.\n" +
                 "Fry 3 pancakes for 2 to 3 minutes. Add 1 teaspoon of vegetable oil to the pan and swirl to coat. Add 2-tablespoon portions of the batter to the pan, cooking 3 at a time. Cook on the first side until bubbles appear on the surface, the edges begin to look dry, and the bottoms are golden-brown, about 3 minutes.\n" +
                 "Flip and cook for another 2 to 3 minutes. Flip the pancakes. Cook until the second sides are golden-brown, 2 to 3 minutes more. Transfer to a warm oven or plate. Repeat using the remaining oil and cooking the remaining batter.",R.drawable.donuts));
         recipes1.add(new Recipes("Dosa","3 cups rice\n" +
                 "1 cup urad dal (split, skinless black gram)\n" +
                 "3/4 teaspoon fenugreek seeds\n" +
                 "Salt, to taste\n" +
                 "Ghee (or vegetable, canola, or sunflower oil)","Method","A mixture of rice and black gram that has been soaked in water is ground finely to form a batter. Some add a handful of soaked fenugreek seeds. The proportion of rice to lentils is generally 3:1 or 4:1. The batter is allowed to ferment overnight, before being mixed with water to get the desired consistency. The batter is then ladled onto a hot tava (griddle) greased with oil or ghee (clarified butter). It is spread out with the base of a ladle or bowl to form a pancake. It can be made either to be thick like a pancake, or thin and crispy. A dosa is served hot, either folded in half or rolled like a wrap. It is usually served with chutney and sambar. The mixture of black grams and rice can be replaced with highly refined wheat flour or semolina.",R.drawable.dosa));
        myrecycleView=(RecyclerView)findViewById(R.id.recyclerView_id);
        myAdapter=new RecyclerViewAdapter(this,recipes1);
        myrecycleView.setLayoutManager(new GridLayoutManager(this,1));
        myrecycleView.setAdapter(myAdapter);
    }

}
