/*
 * Copyright (C) 2009-2015 Felix Bechstein
 * 
 * This file is part of CallMeter NG.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; If not, see <http://www.gnu.org/licenses/>.
 */
package de.ub0r.de.android.callMeterNG;

import android.app.Activity;
import android.os.Bundle;

/**
 * Display About {@link Activity}.
 *
 * @author flx
 */
public class About extends Activity {

    /**
     * {@inheritDoc}
     */
    @Override
    public final void onCreate(final Bundle savedInstanceState) {
        this.setTheme(Preferences.getTheme(this));
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.about);
        this.setTitle(this.getString(R.string.about_) + " "
                + this.getString(R.string.app_name) + " v"
                + BuildConfig.VERSION_NAME);
    }
}
