package com.example.gamereview;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.gamereview.R;
import com.google.android.material.navigation.NavigationView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView navigationView;

    List<Game> lstGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        getSupportActionBar().setTitle("Game Review");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        navigationView = findViewById(R.id.mNavMenu);
        navigationView.setNavigationItemSelectedListener(this);

        ListaGames();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.seach_toolbar, menu);

        MenuItem menuItem = menu.findItem(R.id.action_search);

        return super.onCreateOptionsMenu(menu);
    }

    public void ListaGames() {

        lstGame = new ArrayList<>();

        lstGame.add(new Game("Skyrim", "Categoria", "Descrição", R.drawable.skyrim));
        lstGame.add(new Game("Final Fantasy XV", "Categoria", "Descrição", R.drawable.ff15));
        lstGame.add(new Game("Cyberpunk 2077", "Categoria", "Descrição", R.drawable.cyberpunk));
        lstGame.add(new Game("Destiny 2", "Categoria", "Descrição", R.drawable.destiny2));
        lstGame.add(new Game("The Witcher 3", "Categoria", "Descrição", R.drawable.thewitcher));
        lstGame.add(new Game("For Honor", "Categoria", "Descrição", R.drawable.forhonor));
        lstGame.add(new Game("Watch Dogs: Legion", "Categoria", "Descrição", R.drawable.watchdogs));
        lstGame.add(new Game("Skyrim", "Categoria", "Descrição", R.drawable.skyrim));
        lstGame.add(new Game("Final Fantasy XV", "Categoria", "Descrição", R.drawable.ff15));
        lstGame.add(new Game("Cyberpunk 2077", "Categoria", "Descrição", R.drawable.cyberpunk));
        lstGame.add(new Game("Destiny 2", "Categoria", "Descrição", R.drawable.destiny2));
        lstGame.add(new Game("The Witcher 3", "Categoria", "Descrição", R.drawable.thewitcher));
        lstGame.add(new Game("For Honor", "Categoria", "Descrição", R.drawable.forhonor));
        lstGame.add(new Game("Watch Dogs: Legion", "Categoria", "Descrição", R.drawable.watchdogs));
        lstGame.add(new Game("Skyrim", "Categoria", "Descrição", R.drawable.skyrim));
        lstGame.add(new Game("Final Fantasy XV", "Categoria", "Descrição", R.drawable.ff15));
        lstGame.add(new Game("Cyberpunk 2077", "Categoria", "Descrição", R.drawable.cyberpunk));
        lstGame.add(new Game("Destiny 2", "Categoria", "Descrição", R.drawable.destiny2));
        lstGame.add(new Game("The Witcher 3", "Categoria", "Descrição", R.drawable.thewitcher));
        lstGame.add(new Game("For Honor", "Categoria", "Descrição", R.drawable.forhonor));
        lstGame.add(new Game("Watch Dogs: Legion", "Categoria", "Descrição", R.drawable.watchdogs));

        RecyclerView myrv = findViewById(R.id.recycle_view_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstGame);
        myrv.setLayoutManager(new GridLayoutManager(TelaPrincipal.this, 3));
        myrv.setAdapter(myAdapter);

    }

    public boolean profileButton(View view) {
        Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case (R.id.category):
                Toast.makeText(this, "Categorias", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.notifications):
                Toast.makeText(this, "Notificações", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.favorites):
                Toast.makeText(this, "Favoritos", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.help):
                Toast.makeText(this, "Ajuda", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.config):
                Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.exit):
                Intent intent = new Intent(this, LoginScreen.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}