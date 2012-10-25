Create proc sp_insertStaff
(
	@DeparmentID int,
	@AccountID int,
	@StaffName varchar(50),
	@StaffPhone varchar(11),
	@StaffEmail varchar(50),
	@StaffDOB smalldatetime,
	@DateJoined smalldatetime,
	@StaffLeft smalldatetime,
	@Status bit
)
as 
	begin
	insert into Staff values(@DeparmentID,@AccountID,@StaffName,@StaffPhone,@StaffEmail,@StaffDOB,@DateJoined,@StaffLeft,@Status)
	end

--update

Create proc sp_updateStaff
(
	@StaffID int,
	@DeparmentID int,
	@AccountID int,
	@StaffName varchar(50),
	@StaffPhone varchar(11),
	@StaffEmail varchar(50),
	@StaffDOB smalldatetime,
	@DateJoined smalldatetime,
	@StaffLeft smalldatetime,
	@Status bit
)
as
	begin
		update Staff 
		set
		Department_id = @DeparmentID,
		Acc_id = @AccountID,
		Staff_name = @StaffName,
		Staff_phone = @StaffPhone,
		Staff_email = @StaffEmail,
		Staff_dob = @StaffDOB,
		Date_joined = @DateJoined,
		Date_left = @StaffLeft,
		Status = @Status
	where Staff_id = @StaffID
	end

--delete

Create proc sp_deleteStaff
(
	@StaffID int
)
as
begin
	delete from Staff where Staff_id = @StaffID
end

--select
Create proc sp_getStaff
(
	@StaffID int,
	@DeparmentID int,
	@AccountID int,
	@StaffName varchar(50),
	@StaffPhone varchar(11),
	@StaffEmail varchar(50),
	@StaffDOB smalldatetime,
	@DateJoined smalldatetime,
	@StaffLeft smalldatetime,
	@Status bit
)
as
	begin
	select @DeparmentID,@AccountID,@StaffName,@StaffPhone,@StaffEmail,@StaffDOB,@DateJoined,@StaffLeft,@Status from Staff
	end