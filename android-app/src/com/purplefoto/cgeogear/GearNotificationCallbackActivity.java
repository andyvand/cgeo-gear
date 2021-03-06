/*
	Copyright 2014 Eric Cloninger (purplefoto.com)
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
		http://www.apache.org/licenses/LICENSE-2.0
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */

package com.purplefoto.cgeogear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

// Stub for watch data to phone.  Currently (2014-12-05) not being used.

public class GearNotificationCallbackActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        String data = intent.getStringExtra("extra_action_data");

        if (data != null) {
            Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
        }
        
        // We don't actually need to do anything with the user on notification, so quit
        this.finish();
    }
}
