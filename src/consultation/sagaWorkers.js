import { call, put } from 'redux-saga/effects'
import axios from 'axios'
import {
   // GET_PATIENTS,
     SET_CONSULTATIONS,
    // PUT_PATIENTS,
    // POST_PATIENTS,
    // DELETE_PATIENTS,
    // CANCEL_PATIENT_UPDATE,
    // EDIT_PATIENT,
} from './actions'

const uri = 'http://localhost:8080/consultations'

export function* workerGetConsultations() {
  console.log('Get consultations')
  try {
    const result = yield call(axios.get, uri);
    console.log("call",result.data);
    yield put({ type: SET_CONSULTATIONS, value: result.data });
  }
  catch {
    console.log('Failed');
  }
}

