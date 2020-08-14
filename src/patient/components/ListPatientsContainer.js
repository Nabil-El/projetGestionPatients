import React, { Component } from "react";
import {connect} from "react-redux";
import {
  GET_PATIENTS,
  // SET_PATIENTS,
  // PUT_PATIENTS,
  // POST_PATIENTS,
  // DELETE_PATIENTS,
  // CANCEL_PATIENT_UPDATE,
  // EDIT_PATIENT,
} from "../actions";

import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';

class ListPatientsContainer extends Component {
  /* constructor(props) {
    super(props);
    this.state = {
      patients: [],
    }
  } */

  componentDidMount() {
    this.props.getPatients();
    console.log(this.props.patients);
  }

  render() {
    const { fetching, patients } = this.props
    console.log(this.props)
    console.log("fetchiiing  :",fetching)
    console.log("patients val :  ",patients)
    
    return (

      (fetching || patients === undefined)
        ? <div>Loading ...</div>
        : <TableContainer component={Paper}>
          <Table className="table" aria-label="simple table">
            <TableHead className="head">
              <TableRow>
              <TableCell align="left">id</TableCell>
              <TableCell align="left">prenom</TableCell>
                <TableCell>Nom</TableCell>
                
                
              </TableRow>
            </TableHead>
            <TableBody>
              {patients.map((patients) => (
                <TableRow key={patients.id}>
                  <TableCell component="th" scope="row">
                    {patients.id}
                  </TableCell>
                  
                  <TableCell align="left">{patients.prenomPatient}</TableCell>
                  <TableCell align="left">{patients.nomPatient}</TableCell>
                </TableRow>
              ))}
            </TableBody>
          </Table>
        </TableContainer>)
  }
}

    /* return (
      <div><form>
  <label>
    Nom :
    <input type="text" name="name" />
  </label>
  <input type="submit" value="Envoyer" />
  <input type="text" name="name" />
  </label>
  <input type="submit" value="Envoyer" />
</form>
    List Patients</div>)
  }
} */

const mapStateTopProps = (state) => {
  console.log("state :",state)
  return {
    patients: state.patientReducer.patients,
    fetching : state.patientReducer.fetching
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    getPatients: () => {
      dispatch({ type: GET_PATIENTS })
    }
  }
} 

export default connect(mapStateTopProps, mapDispatchToProps)(ListPatientsContainer);
