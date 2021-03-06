/*
 *     Navigation bar function expansion module
 *     Copyright (C) 2017 egguncle cicadashadow@gmail.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.egguncle.xposednavigationbar.hook.btnFunc;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.egguncle.xposednavigationbar.constant.ConstantStr;
import com.egguncle.xposednavigationbar.hook.hookFunc.StartCommand;
import com.egguncle.xposednavigationbar.hook.util.XpLog;

import static com.egguncle.xposednavigationbar.constant.ConstantStr.COMMAND_STR;

/**
 * Created by egguncle on 17-6-25.
 */

public class BtnStartCommand extends StartCommand {
    private Intent mIntent;

    public BtnStartCommand(String command) {
        super(command);
        mIntent = new Intent();
        mIntent.setAction(ConstantStr.ACTION_COMMAND);
    }

    @Override
    protected void startCommand(String command, Context context) {
        mIntent.putExtra(COMMAND_STR, command);
        XpLog.i(command);
        context.sendBroadcast(mIntent);
    }
}
