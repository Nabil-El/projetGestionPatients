import { all } from 'redux-saga/effects'
import { watchGetPatients } from '../patient/sagaWatchers'
import { watchGetConsultations } from '../consultation/sagaWatchers'

export default function* () {
  yield all([
    watchGetPatients(),
    watchGetConsultations()
  ])
}