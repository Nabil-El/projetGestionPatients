import { takeEvery } from 'redux-saga/effects';

import * as PatientWorkers from './sagaWorkers';
import {
  GET_PATIENTS,
  // SET_PATIENTS,
  // PUT_PATIENTS,
  // POST_PATIENTS,
  // DELETE_PATIENTS,
  // CANCEL_PATIENT_UPDATE,
  // EDIT_PATIENT,
} from './actions'

const {
  workerGetPatients,
} = PatientWorkers

export const watchGetPatients = function* () {
  console.log("watcher patients")
  yield takeEvery(GET_PATIENTS, workerGetPatients);
}


