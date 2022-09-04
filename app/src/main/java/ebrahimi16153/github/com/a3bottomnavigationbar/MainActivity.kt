package ebrahimi16153.github.com.a3bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import ebrahimi16153.github.com.a3bottomnavigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //binding
    private lateinit var binding: ActivityMainBinding

    // nav
    private lateinit var nacController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        nacController = findNavController(R.id.navHost)
        appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment,R.id.favoriteFragment,R.id.addFragment,R.id.searchFragment))
        setupActionBarWithNavController(nacController,appBarConfiguration)
        binding.bottomNav.setupWithNavController(nacController)
        


    }

    override fun onNavigateUp(): Boolean {
        return nacController.navigateUp() ||  super.onNavigateUp()
    }
}