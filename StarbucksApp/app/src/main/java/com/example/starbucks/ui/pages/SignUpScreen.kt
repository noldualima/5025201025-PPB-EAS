package com.example.starbucks.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.StarbucksTheme
import com.example.starbucks.R
import com.example.starbucks.ui.components.TextFieldInput


@Composable
fun SignUpScreen(
    onSignUpClick: () -> Unit,
    onSignInClick: () -> Unit,
//    onPolicyClick: () -> Unit,
//    onPrivacyClick: () -> Unit
) {
    val (email, setEmail) = rememberSaveable {
        mutableStateOf("")
    }

    val (password, setPassword) = rememberSaveable {
        mutableStateOf("")
    }

//    val (agree, onAgreeChange) = rememberSaveable {
//        mutableStateOf(false)
//    }

//    val context = LocalContext.current


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = 52.dp,
                vertical = 52.dp
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
            }
        }
        Spacer(modifier = Modifier.size(32.dp))
        Text(
            text = "Sign Up",
            fontSize = 28.sp,
            fontWeight = FontWeight.W500
        )
        Text(
            modifier = Modifier.padding(vertical = 12.dp),
            text = "Start earning rewards and enjoying perks with the Starbucks app. Join today!",
            fontSize = 14.sp,
            textAlign = TextAlign.Justify
        )
        TextFieldInput(
            value = email,
            onValueChange = setEmail,
            labelText = "Email"
        )
        TextFieldInput(
            value = password,
            onValueChange = setPassword,
            labelText = "Password",
            visualTransformation =  PasswordVisualTransformation(),
            keyboardType = KeyboardType.Password
        )
        TextFieldInput(
            value = password,
            onValueChange = setPassword,
            labelText = "Confirm Your Password",
            visualTransformation =  PasswordVisualTransformation(),
            keyboardType = KeyboardType.Password
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val privacyText = "Privacy"
            val policyText = "Policy"
//            val annotatedString = buildAnnotatedString {
//                withStyle(SpanStyle(color = MaterialTheme.colorScheme.onBackground)) {
//                    append("I agree with")
//                }
//                append(" ")
//                withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
//                    pushStringAnnotation(tag = privacyText, annotation = privacyText)
//                    append(privacyText)
//                }
//                append(" And ")
//                withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
//                    pushStringAnnotation(tag = policyText, annotation = policyText)
//                    append(policyText)
//                }
//            }

//            Checkbox(checked = agree, onCheckedChange = onAgreeChange)
//            ClickableText(
//                annotatedString
//            ) {offset ->
//                annotatedString.getStringAnnotations(offset, offset).forEach {
//                    when(it.tag){
//                        privacyText -> {
//                            Toast.makeText(context, "Privacy Text Clicked", Toast.LENGTH_SHORT).show()
//                            onPrivacyClick()
//                        }
//
//                        policyText -> {
//                            Toast.makeText(context, "Policy Text Clicked", Toast.LENGTH_SHORT).show()
//                            onPolicyClick()
//                        }
//                    }
//                }
//            }
        }
        Spacer(modifier = Modifier.size(20.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onSignUpClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        ) {
            Text(text = "Register")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Already have an account?",
                fontSize = 14.sp
            )
            TextButton(onClick = onSignInClick) {
                Text(
                    text = "Sign In",
                    fontSize = 14.sp
                )
            }
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SignUpScreenPreview() {
    StarbucksTheme {
        SignUpScreen({}, {})
    }
}