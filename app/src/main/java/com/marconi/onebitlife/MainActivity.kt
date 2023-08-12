package com.marconi.onebitlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import com.marconi.onebitlife.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textMind    = binding.mainTextViewMind
        val textMoney   = binding.mainTextViewMoney
        val textBody    = binding.mainTextViewBody
        val textFun     = binding.mainTextViewFun
        textMind.text = Html.fromHtml(getString(R.string.main_mind_text))
        textMoney.text = Html.fromHtml(getString(R.string.main_money_text))
        textBody.text = Html.fromHtml(getString(R.string.main_body_text))
        textFun.text = Html.fromHtml(getString(R.string.main_fun_text))

        binding.mainContinueButton.setOnClickListener {
            Util.openActivity(this, HomeActivity::class.java)
        }
    }
}