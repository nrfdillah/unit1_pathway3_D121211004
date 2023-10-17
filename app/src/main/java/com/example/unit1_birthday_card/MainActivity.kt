package com.example.unit1_birthday_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.unit1_birthday_card.ui.theme.Unit1_birthday_cardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unit1_birthday_cardTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        message = "Nurfadillah",
                        from = "Student of Hasanuddin University",
                        phone = " +628123456",
                        address = " Kab.Bone, Sulsel",
                        email = " abcdillah@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    message: String,
    from: String,
    phone: String,
    address: String,
    email: String
) {
    Box(
        modifier = modifier
            .background(brush = Brush.verticalGradient(colors = listOf(Color(0xFFFF69B4), Color(0xFFFFC0CB))))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 190.dp, start = 8.dp, end = 8.dp, bottom = 16.dp)
        )
        {
            GreetingImage(message, from)
            Text(
                text = message,
                fontSize = 50.sp,
                lineHeight = 90.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = from,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(7.dp)
            )
        }
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.fillMaxSize().padding(start = 100.dp, bottom = 25.dp)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.padding(bottom = 7.dp)

            ){
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.phone_number),
                    contentDescription = "Mobile Phone Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = phone,
                    fontSize = 17.sp,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            }
            Divider(
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(0.7f).height(1.dp)
            )
            Spacer(modifier = Modifier.padding(bottom = 5.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.padding(bottom = 7.dp)

            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.address),
                    contentDescription = "address icon",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = address,
                    fontSize = 17.sp,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            }
            
            Divider(
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(0.7f).height(1.dp)
            )
            Spacer(modifier = Modifier.padding(bottom = 7.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ){
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.email),
                    contentDescription = "email icon",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = email,
                    fontSize = 17.sp,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.logo_resmi_unhas)
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(190.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Unit1_birthday_cardTheme {
        Greeting(
            message = "Nurfadillah",
            from = "Student of Hasanuddin University",
            phone = " +628123456",
            address = " Kab.Bone, Sulsel",
            email = " abcdillah@gmail.com"
        )
    }
}