import { takeEvery } from 'redux-saga/effects';

import * as ConsultationsWorkers from './sagaWorkers';
import {
   GET_CONSULTATIONS,
  // SET_PATIENTS,
  // PUT_PATIENTS,
  // POST_PATIENTS,
  // DELETE_PATIENTS,
  // CANCEL_PATIENT_UPDATE,
  // EDIT_PATIENT,
} from './actions'

const {
  workerGetConsultations,
} = ConsultationsWorkers

export const watchGetConsultations = function* () {
  console.log("watcher consultations")
  yield takeEvery(GET_CONSULTATIONS, workerGetConsultations);
}




