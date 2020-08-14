import { call, put } from 'redux-saga/effects'
import axios from 'axios'
import {
   // GET_PATIENTS,
     SET_PATIENTS,
    // PUT_PATIENTS,
    // POST_PATIENTS,
    // DELETE_PATIENTS,
    // CANCEL_PATIENT_UPDATE,
    // EDIT_PATIENT,
} from './actions'

const uri = 'http://localhost:8080/patients'

export function* workerGetPatients() {
  console.log('Get patient')
  try {
    const result = yield call(axios.get, uri);
    console.log(result.data);
    yield put({ type: SET_PATIENTS, value: result.data });
  }
  catch {
    console.log('Failed');
  }
}

