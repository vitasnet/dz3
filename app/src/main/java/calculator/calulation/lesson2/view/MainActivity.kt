package calculator.calulation.lesson2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import calculator.calulation.lesson2.R
import calculator.calulation.lesson2.databinding.ActivityMainBinding
import calculator.calulation.lesson2.databinding.MainFragmentBinding
import calculator.calulation.lesson2.lesson3.NullSafety

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,MainFragment.newInstance()).commit()
        }
        NullSafety.foo()
    }
}