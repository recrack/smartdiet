/*
 * This file is part of SmartDiet.
 *
 * Copyright (C) 2011, Aki Saarinen.
 *
 * SmartDiet was developed in affiliation with Aalto University School
 * of Science, Department of Computer Science and Engineering. For
 * more information about the department, see <http://cse.aalto.fi/>.
 *
 * SmartDiet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SmartDiet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SmartDiet.  If not, see <http://www.gnu.org/licenses/>.
 */

package fi.akisaarinen.smartdiet.measurement.pt4

case class StatusPacket(length: Int,
                   packetType: Int,
                   firmwareVersion: Int,
                   protocolVersion: Int,
                   fineCurrent: Currents,
                   coarseCurrent: Currents,
                   voltage1: Int,
                   voltage2: Int,
                   outputVoltageSetting: Int,
                   temperature: Int,
                   status: Int,
                   serialNumber: Int,
                   sampleRate: Int,
                   initialUsbVoltage: Int,
                   initialAuxVoltage: Int,
                   hardwareRevision: Int,
                   eventCode: Int,
                   checkSum: Int)


case class Currents(main: Int, usb: Int, aux: Int)